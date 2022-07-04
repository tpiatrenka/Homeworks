package hw_10.task_2;

public enum RenameStrategy implements Renamable {
    LOWERCASE {
        @Override
        public String name(String s) {
            return s.toLowerCase();
        }
    },
    CAPITALIZED {
        @Override
        public String name(String s) {
            return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        }
    },
    UPEERCASE {
        @Override
        public String name(String s) {
            return s.toUpperCase();
        }
    };


}
