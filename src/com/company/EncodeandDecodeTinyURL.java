package com.company;

import java.util.HashMap;

public class EncodeandDecodeTinyURL {
    //535. Encode and Decode TinyURL
    //https://leetcode.com/problems/encode-and-decode-tinyurl/
    //https://www.youtube.com/watch?v=VyBOaboQLGc&ab_channel=NeetCode
    HashMap<String, String> decode = new HashMap<>();
    HashMap<String, String> encode= new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {

        if(!encode.containsKey(longUrl)){
            encode.put(String.valueOf(encode.size()+1),longUrl);
            decode.put(longUrl, String.valueOf(encode.size()));
        }
        return decode.get(longUrl);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return encode.get(shortUrl);
    }

}
