package com.cykj.service;

import com.cykj.utils.ResponseDTO;

public interface UserService {
    ResponseDTO login(String acc,String pwd);
}
