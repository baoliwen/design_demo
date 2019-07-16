package com.dosimple.designdemo.composite.one;

import java.util.List;

/**
 * @author baolw
 */
class Client {
    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));
    }

    public static Branch compositeCorpTree() {
        Branch root = new Branch("王大麻子", "总经理", 100000);

        Branch developDep = new Branch("刘大瘸子", "研发部经历", 10000);
        Branch salesDep = new Branch("马儿拐子", "销售部经历", 10000);
        Branch financeDep = new Branch("赵三", "财务部经历", 10000);
        Branch firstDevDep = new Branch("杨三", "开发一组组长", 10000);
        Branch secondDevDep = new Branch("武大", "开发二组组长", 10000);

        Leaf a = new Leaf("a", "开发人员", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "开发人员", 2000);
        Leaf h = new Leaf("h", "销售人员", 2000);
        Leaf i = new Leaf("i", "销售人员", 2000);
        Leaf j = new Leaf("j", "销售人员", 2000);
        Leaf k = new Leaf("k", "CEO秘书", 2000);
        Leaf zhenglaoliu = new Leaf("老六", "研发部副经理", 20000);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);
        root.addSubordinate(k);

        developDep.addSubordinate(zhenglaoliu);
        developDep.addSubordinate(firstDevDep);
        developDep.addSubordinate(secondDevDep);

        firstDevDep.addSubordinate(a);
        firstDevDep.addSubordinate(b);
        firstDevDep.addSubordinate(c);
        secondDevDep.addSubordinate(d);
        secondDevDep.addSubordinate(e);
        secondDevDep.addSubordinate(f);
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);
        financeDep.addSubordinate(j);
        return root;
    }

    public static String getTreeInfo(Branch root) {
        List<ICorp> list = root.getSubordinate();
        String info = "";
        for (ICorp s : list) {
            if (s instanceof Leaf) {
                info = info + s.getInfo() + "\n";
            } else {
                info += s.getInfo() + "\n" + getTreeInfo((Branch) s);
            }
        }
        return info;
    }
}
