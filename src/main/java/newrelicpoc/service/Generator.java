package newrelicpoc.service;

import com.newrelic.api.agent.Trace;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    @Trace(dispatcher = true)
    public String generateRandomString(int length) {
        return RandomStringUtils.random(length, true, false);
    }

    @Trace
    public Integer generateRandomInteger() {
        return ThreadLocalRandom.current().nextInt();
    }
}
