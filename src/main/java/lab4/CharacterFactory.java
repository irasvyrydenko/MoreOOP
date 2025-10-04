package lab4;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

public class CharacterFactory {
    private static final Random RANDOM = new Random();
    private static final List<Class<? extends Character>> classes = List.of(Hobbit.class, Elf.class, Knight.class, King.class);

    public static Character createRandomCharacter() {
        int choice = RANDOM.nextInt(classes.size());
        try {
            return classes.get(choice).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Character createRandomCharacterWithReflection() {
        Reflections reflections = new Reflections("lab4");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        if (subTypes.isEmpty()) return null;
        int choice = RANDOM.nextInt(subTypes.size());
        Class<? extends Character> characterClass = subTypes.toArray(new Class[0])[choice];
        try {
            return characterClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}