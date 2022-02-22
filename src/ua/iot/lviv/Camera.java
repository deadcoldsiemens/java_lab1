package ua.iot.lviv;

public record Camera (String manufacturer, double ram, boolean zoomRatio, int price, String bodyType, int effectivePixels) {

    public static final String CameraOwner = "Yaroslave";

    public Camera() {
        this("Canon", 16, true, 400, "ultracompact", 16);
    }

    public Camera(String manufacturer, double ram, boolean zoomRatio) {

        this(manufacturer, ram, zoomRatio, 250, "ultracompact", 12);
    }

    @Override
    public String toString() {
        return String.format("manufacturer = %s, ram = %d, zoomRatio = %b, price = %d, bodyType = %s, effectivePixels = %d, CameraOwner = %s", manufacturer, ram, zoomRatio, price, bodyType, effectivePixels, CameraOwner);
    }

    public static String CameraOwner() {
        return CameraOwner;
    }
}