package com.github.gabrieljones

import logtwo.NanoClock
import java.time.Instant
import org.scalatest._

class NanoClockSpec extends FlatSpec with Matchers {

  "A NanoClock" should "produce values between values produced by the default Java 9 system clock" in {
    val nanoClock = new NanoClock()
    val instantBefore = Instant.now() 
    val instantNanoClock = Instant.now(nanoClock)
    val instantAfter = Instant.now()

    println("   Before: " + instantBefore)
    println("NanoClock: " + instantNanoClock)
    println("    After: " + instantAfter)
    
    instantNanoClock should be > instantBefore
    instantNanoClock should be < instantAfter
  }
}
