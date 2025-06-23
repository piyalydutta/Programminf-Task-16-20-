// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }

    double calculatePerimeter() {
        // একটি সাধারণ সমকোণী ত্রিভুজ ধরে নেওয়া হয়েছে
        return base + height + Math.sqrt(base * base + height * height);
    }
}
