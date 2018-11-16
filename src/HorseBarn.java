public class HorseBarn {
    private Horse[] spaces;
    public HorseBarn(Horse[] spaces) {
        this.spaces = spaces;
    }
    public int findHorseSpace(String name) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null && name.equals(spaces[i].getName())) {
                return i;
            }
        }
        return -1;
    }
    public void consolidate() {
        for (int i = 0; i < spaces.length-1; i++) {
            if (spaces[i] == null) {
                for (int j = i + 1; j < spaces.length; j++) {
                    if (spaces[j] != null) {
                        spaces[i] = spaces[j];
                        spaces[j] = null;
                        j = spaces.length;
                    }
                }
            }
        }
    }
    public String toString() {
        String result = "";
        Horse[1] = null;
        Horse[3] = null;
        Horse[5] = null;
        Horse
        }

    }
}
