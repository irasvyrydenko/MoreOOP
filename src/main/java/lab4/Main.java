package lab4;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.setColor(FlowerColor.RED);
        flower.setPrice(70);
        flower.setSepalLength(10);
        flower.setFlowerType(FlowerType.ROSE);

        FlowerPack flowerPack = new FlowerPack(flower, 11);
        flowerPack.setFlower(flower);
        flowerPack.setQuantity(11);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);
        System.out.println(flowerBucket.getPrice());
        flower.setPrice(100);
        System.out.println(flowerBucket.getPrice());
    }
}
