package com.axkea.publish.core.service;

import com.axkea.publish.pojo.Video;

import java.util.List;

/**
 * @Description
 * @Author welsir
 * @Date 2023/11/1 22:04
 */
public interface VideoService {

    List<Video> getVideoByUserId(String userId);

}