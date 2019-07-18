package com.dosimple.designdemo.faced.one;

/**
 * @author baolw
 */
interface ILetterProcess {
    void writeContext(String context);

    void fillEnvelope(String address);

    void letterIntoEnvelope();

    void sendLetter();
}
