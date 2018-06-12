package com.blackcrowsys.commonutils.test.controllers

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite, Matchers}
import org.scalatest.junit.JUnitRunner
import org.scalatest.mockito.MockitoSugar
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.TestContextManager
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@RunWith(classOf[JUnitRunner])
abstract class ControllerSpec(
                               controllerClass: Class[_]
                             )
  extends FunSuite with Matchers with MockitoSugar with BeforeAndAfter {

  var mvc: MockMvc = _

  @Autowired
  val webApplicationContext: WebApplicationContext = null

  before {
    new TestContextManager(this.getClass).prepareTestInstance(this)
    mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build()
  }
}
