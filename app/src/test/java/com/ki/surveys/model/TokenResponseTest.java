package com.ki.surveys.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokenResponseTest {
    private TokenResponse tokenResponse;
    @Before
    public void setUp()  {
        tokenResponse = new TokenResponse();
        tokenResponse.setAccessToken("79e8b6fb8064c6901e384b8f3888ba9f20d0963c48523b34f97b9025e7c30a6c");
    }
    @Test
    public void accessToken_String_Set_As_SomeStringValue_ReturnsTrue() {
        assertNotEquals(true,tokenResponse.getAccessToken());
    }

    @After
    public void tearDown() throws Exception {
        tokenResponse =null;
    }

}