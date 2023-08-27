public class shapeOffice {
    public shape  shapeCreate(){

        int i = (int)(4*(Math.random()));

    shape a = null;
        switch (i){
            case 0:
                a = new circle();
                break;
            case 1:
                a = new rectangle();
                break;
            case 2:
                a= new square();
                break;
            case 3:
                a = new triagle();
                break;


        }

return a;
    }
}
