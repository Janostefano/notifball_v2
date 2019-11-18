package com.notifball.notifball

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@ActiveProfiles("integration")
@SpringBootTest(
        classes = AppRunner,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
abstract class BaseIntegrationSpec extends Specification {


}
