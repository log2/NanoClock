[![Build Status](https://travis-ci.org/gabrieljones/NanoClock.svg?branch=master)](https://travis-ci.org/gabrieljones/NanoClock)

# NanoClock

An attempt to demonstrate why [java.lang.System.nanoTime](https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#nanoTime--) is not appropriate to use in making a [java.time.Clock](https://docs.oracle.com/javase/8/docs/api/java/time/Clock.html).

I reiterate the following from the System.nanoTime documentation:

> This method can only be used to measure elapsed time and is not related to any other notion of system or wall-clock time.
