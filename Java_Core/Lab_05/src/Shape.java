public class Shape {
    public static final int SHAPE_RECTANGLE = 1;
    public static final int SHAPE_CIRCLE = 2;
    public static final int SHAPE_TRIANGLE = 3;

    public int shareCode = 0;

    /**
     *
     * @param width chiều rộng
     * @param height chiều dài
     * @see
     */
    public void tinhDienTich(float width, float height) {
        float square = width * height;
        System.out.println("square hcn = " + square);
    }

    /**
     *
     * @param radius Bán kính hình tròn
     */
    public void tinhDienTich(float radius){
        float square = radius * radius * 3.14f;
        System.out.println("square hinh tron = " + square);
    }

    /**
     *
     * @param height Chiều cao tam giác
     * @param bottom Chiều dài cạnh đáy tương ứng
     */
    public void tinhDienTich(float height, double bottom){
        float square = height * (float) bottom / 2f;
        System.out.println("square hinh tam giac = " + square);
    }

    /**
     *
     * @param width Chiều dài
     * @param height Chiều rộng
     */
    public void tinhChuVi(float width, float height){
        float perimeter = (width + height) * 2;
        System.out.println("perimeter = " + perimeter);
    }

    /**
     *
     * @param radius Bán kính
     */
    public void tinhChuVi(float radius){
        float perimeter = radius * 2 * 3.14f;
        System.out.println("perimeter = " + perimeter);
    }

    /**
     *
     * @param edge1 Cạnh thứ 1
     * @param edge2 Cạnh thứ 2
     * @param edge3 Cạnh thứ 3
     */
    public void tinhChuVi(float edge1, float edge2, float edge3){
        float perimeter = (edge1 + edge2 + edge3);
        System.out.println("perimeter = " + perimeter);
    }


}
