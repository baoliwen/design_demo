package com.dosimple.designdemo.mediator.two;

/**
 * @author baolw
 */
class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            this.buyComputer(Integer.valueOf(objects[0].toString()));
        } else if (str.equals("sale.sell")) {
            this.sellComputer(Integer.valueOf(objects[0].toString()));
        } else if (str.equals("sale.offsell")) {
            this.offSale();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑：" + number + "台");
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑：" + buyNumber + "台");
        }
    }

    public void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑" + number + "台");
        super.stock.decrease(number);
    }

    public void offSale() {
        System.out.println("折价销售IBM电脑" + super.stock.getStockNumber() + "台");
    }

    public void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
