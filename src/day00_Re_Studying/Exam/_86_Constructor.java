package day00_Re_Studying.Exam;

 class _86_Constructor {
    int x;
    _86_Constructor(){
        this(10);
    }
    _86_Constructor(int x){
        this.x=x;
    }
    class Car extends _86_Constructor{
        int y;
        Car(){
            super(10);
        }
        Car(int y){
            super(y);
            this.y=y;
        }
        public String toString (){
            return super.x+" "+this.y;
        }

    }

}
