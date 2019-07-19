package com.dosimple.designdemo.faced.one;

class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcess();

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);

        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();

    }
}
