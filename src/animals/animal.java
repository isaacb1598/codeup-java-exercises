package animals;

public class animal {
   private String name;
   private String sound;

   public animal() {
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public animal(String name, String sound) {
       this.name = name;
       this.sound = sound;
   }

   public void makeNoise() {
       System.out.println(name + " goes " + sound);
   }
}