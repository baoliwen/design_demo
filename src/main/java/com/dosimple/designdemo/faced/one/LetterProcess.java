package com.dosimple.designdemo.faced.one;
class LetterProcess implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("写信内容");
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("装入信封");
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("放入信箱");
    }

    @Override
    public void sendLetter() {
        System.out.println("发送信件");
    }
}
