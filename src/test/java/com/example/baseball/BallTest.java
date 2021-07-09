package com.example.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class BallTest {
    private Ball computer;

    @BeforeEach
    void setup() {
        computer = new Ball(1, 1);
    }

    @Test
    void ball() {
        Ball player = new Ball(1, 2);
        BallStatus ballStatus = computer.play(player);
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        Ball player = new Ball(1, 1);
        BallStatus ballStatus = computer.play(player);
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void nothing() {
        Ball player = new Ball(2, 3);
        BallStatus ballStatus = computer.play(player);
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    void throwIllegalArgumentException_WhenBallNumberOver9OrUnder1(int input) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    new Ball(input, 2);
                });
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 4})
    void throwIllegalArgumentException_WhenBallPositionOver3OrUnder1(int input) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    new Ball(1, input);
                });
    }
}
