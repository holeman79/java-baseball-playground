package com.example.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}
