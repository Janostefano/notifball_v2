package com.notifball.notifball

import com.notifball.notifball.api.TeamsDto
import com.notifball.notifball.infrastructure.team.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders


import static org.springframework.http.HttpMethod.GET

class SomeTest extends BaseIntegrationSpec {

    def "should get teams data from provider and save those in repository"() {
        given:
        HttpHeaders headers = new HttpHeaders()
        headers.set("X-Auth-Token", footballDataToken)
        HttpEntity entity = new HttpEntity<>(headers)

        when:
        def response = restTemplate.exchange("http://api.football-data.org/v2/competitions/2021/teams", GET, entity, TeamsDto.class)
        def teams = teamMapper.toPersistent(teamMapper.toDomain(response.body))
        teamRepository.saveAll(teams)

        then:
        teamRepository.findAll().size() == 20
    }
}
