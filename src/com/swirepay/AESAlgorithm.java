package com.swirepay;

public enum AESAlgorithm {

    AES_CBC_PKCS5Padding("AES/CBC/PKCS5Padding");

    private String algorithm;

    AESAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

}
