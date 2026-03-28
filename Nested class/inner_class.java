public class inner_class {
    public static void main(String[] args) {
        outer outer=new outer();
        outer.inner inner=outer.new inner();
        inner.fun();
        //outer.inner inner=new outer().inner();
    }
}
class outer{
    class inner{
        void fun(){
            System.out.println("this is an inner class");
        }
    }
}
