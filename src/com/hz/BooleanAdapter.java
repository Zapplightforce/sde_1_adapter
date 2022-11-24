package com.hz;

import java.util.Arrays;

public class BooleanAdapter {
        private static String[] VALID_OPTIONS = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        private ConsoleReader reader;

        public BooleanAdapter(ConsoleReader reader){
            this.reader = reader;
        }

        public Boolean readResponse(){
            String rawAnswer = this.reader.readLine();
            return this.isPositive(rawAnswer);
        }

        public Boolean isPositive(String answer){
            return Arrays.asList(BooleanAdapter.VALID_OPTIONS).contains(answer);
        }
}
