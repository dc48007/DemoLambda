import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@FunctionalInterface
interface WithNoReturnType {
    void apply();
}


@FunctionalInterface
interface WithReturnType {
    String execute();
}

@FunctionalInterface
interface UsingGenerics<T, R>{

    //T - represent parameter
    //R - represents return type

    R implement(T t);
}
@FunctionalInterface
interface implementLambda{
    String execute(WithReturnType fhsdfhd);
}


public class DemoLambda {


    implementLambda implementLambda =  (fdhd)-> {
            return fdhd.execute();
        };



    UsingGenerics<Integer, String> usingGenerics = new UsingGenerics<Integer, String>() {
        @Override public String implement(Integer s) {
            return s.toString();
        }
    };
    //using anonymous class
    WithNoReturnType withNoReturnType = () -> System.out.println(" With no return type");


    WithReturnType withReturnType = () -> {
        return "Dimpy";
    };


    public static void main(String[] args) {
        new DemoLambda().withNoReturnType.apply();
        System.out.println(new DemoLambda().withReturnType.execute());
        System.out.println(new DemoLambda().usingGenerics.implement(123873463));
       // new DemoLambda().implementLambda.execute(gd-> {return  gd;});

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nitin", 1234);
        hashMap.put("Deepak", 4457);

        hashMap.forEach((q1, q2)-> System.out.println("Key: "+ q1 + "-------value: "+ q2)
                );

        List<Integer> list  = Arrays.asList(11, 22, 33);
        list.forEach((gdshs)-> System.out.println(gdshs));



    }



}
