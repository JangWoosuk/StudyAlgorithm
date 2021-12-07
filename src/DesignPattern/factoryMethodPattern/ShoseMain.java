package DesignPattern.factoryMethodPattern;

public class ShoseMain {
    public static void main(String[] args){
//        ShoseMake shoseMake = new NikeMake();
//        shoseMake.makeShose();
//
//        ShoseMake shoseMake2 = new AdidasMake();
//        shoseMake2.makeShose();
//
//        ShoseMake shoseMake3 = new LimitedMake("Off White");
//        shoseMake3.makeShose();

//        ShoseCreator shoseCreator = new ShoseCreator();
//        Shose shose = shoseCreator.createShose(new LeatherMaterialFactory(), new LeatherOutsoleFactory());

//        shose.shoseMaterial();
//        shose.shoseOutsole();


        System.out.println("==============");
        ShoseCreator shoseCreator = new ShoseCreator();
        Shose shose = shoseCreator.createShose(new LeatherShoseFactory());
        shose.makeShose();
        shose.shoseMaterial();
        shose.shoseOutsole();

    }
}
