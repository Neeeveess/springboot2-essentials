package com.jvneves.springboot2.util;

import com.jvneves.springboot2.requests.AnimePostRequestBody;
import com.jvneves.springboot2.requests.AnimePutRequestBody;

public class AnimePutRequestBodyCreator {
    public static AnimePutRequestBody createAnimePutRequestBody() {
        return AnimePutRequestBody.builder()
                .id(AnimeCreator.createValidUpdatedAnime().getId())
                .name(AnimeCreator.createValidUpdatedAnime().getName())
                .build();
    }
}
