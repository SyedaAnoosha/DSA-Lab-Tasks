package Lab2;

class Rectangle{
    float length = 0;
    float width = 0;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if(!(length<0.0 && length>20.0)){
            this.length = length;
        }
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if(!(width<0.0 && width>20.0)){
            this.width = width;
        }
    }

    public float Area(){
        return length * width;
    }

    public float Perimeter(){
        float sum = width + length;
        return 2 * sum;
    }
}
public class Question1 {
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.setLength(20);
        R.setWidth(4);
        System.out.println(R.Perimeter());
        System.out.println(R.Area());
    }
}
