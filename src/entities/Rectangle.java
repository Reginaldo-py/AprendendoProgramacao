package entities;

public class Rectangle {
    
    public double width;
    public double height;
    

    public double Area(){

        return width * height;
    }

    public double Perimeter(){

        return (this.width * 2 + this.height * 2);
    }

    public double Diagonal(){

        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2) );

    }

    public String toString(){

       return "Area: " + width + "perimetro: " + height + "diagonal: " + Diagonal();
    }
}
