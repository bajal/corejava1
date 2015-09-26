class Rectangle{
int width;
int height;

Rectangle(){
};

Rectangle(int w,int h){
width=w;
height=h;
};

int area(){
return width * height;
}

}


class testVariables{
public static void main(String arags[]){
//        Rectangle myRect;
//        myRect = new Rectangle();
//        myRect.width = 40;
//        myRect.height = 50;

        Rectangle myRect = new Rectangle(40,50);
        System.out.println("myRect's area is " + myRect.area());
}

}