package com.notifball.notifball

import com.notifball.notifball.infrastructure.team.TeamMapper
import com.notifball.notifball.infrastructure.team.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@ActiveProfiles("integration")
@SpringBootTest(
        classes = NotifballApplication,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
abstract class BaseIntegrationSpec extends Specification {

    @Autowired
    TestRestTemplate restTemplate

    @Autowired
    TeamRepository teamRepository

    @Autowired
    TeamMapper teamMapper

    @Value('${footballDataToken}')
    String footballDataToken

}
