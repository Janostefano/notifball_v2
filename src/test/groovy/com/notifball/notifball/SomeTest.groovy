package com.notifball.notifball

import com.notifball.notifball.infrastructure.KvRepository
import com.notifball.notifball.infrastructure.PersistentKv
import org.springframework.beans.factory.annotation.Autowired

class SomeTest extends BaseIntegrationSpec {

    @Autowired
    KvRepository kvRepository

    def "should get data from db"() {
        given:
        def kv1 = new PersistentKv("some_key", "some_value")
        def kv2 = new PersistentKv("some_key", "some_value")
        kvRepository.save(kv1)
        kvRepository.save(kv2)
        when:
        def result = kvRepository.findAll()
        then:
        result.size() == 2
    }
}
