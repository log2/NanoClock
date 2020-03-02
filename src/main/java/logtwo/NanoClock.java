package logtwo;

import java.time.*;

//Copied from https://stackoverflow.com/a/38658066/263306
public class NanoClock extends Clock
{
    private final Clock clock;

    private final long initialNanos;

    private final Instant initialInstant;

    public NanoClock()
    {
        this(Clock.systemUTC());
    }

    public NanoClock(final Clock clock)
    {
        this.clock = clock;
        initialNanos = getSystemNanos();
        initialInstant = clock.instant();
    }

    @Override
    public ZoneId getZone()
    {
        return clock.getZone();
    }

    @Override
    public Instant instant()
    {
        return initialInstant.plusNanos(getSystemNanos() - initialNanos);
    }

    @Override
    public Clock withZone(final ZoneId zone)
    {
        return new NanoClock(clock.withZone(zone));
    }

    private long getSystemNanos()
    {
        return System.nanoTime();
    }
}
