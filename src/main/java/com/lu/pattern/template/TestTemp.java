package com.lu.pattern.template;

public class TestTemp {


    public abstract class AbstractDay {
        protected boolean shouldBreakfastApply() {
            return true;
        }

        protected boolean shouldLunchApply() {
            return true;
        }

        protected boolean shouldDinnerApply() {
            return true;
        }

        protected abstract void getup();

        protected abstract void breakfast();

        protected abstract void lunch();

        protected abstract void dinner();

        protected abstract void goToSleep();


        public final void run() {
            this.getup();
            if (this.shouldBreakfastApply()) {
                this.breakfast();
            }
            if (this.shouldLunchApply()) {
                this.lunch();
            }
            if (this.shouldDinnerApply()) {
                this.dinner();
            }
            this.goToSleep();
        }

    }


    class holiDay extends AbstractDay {

        @Override
        protected void getup() {
            System.out.println("起床");
        }

        @Override
        protected void breakfast() {
            System.out.println("在家早餐");
        }

        @Override
        protected void lunch() {
            System.out.println("在家午餐");
        }

        @Override
        protected void dinner() {
            System.out.println("在家晚餐");
        }

        @Override
        protected void goToSleep() {
            System.out.println("睡觉");
        }
    }

    class workDay extends AbstractDay {

        @Override
        protected void getup() {
            System.out.println("起床");
        }

        @Override
        protected void breakfast() {
            System.out.println("在公司早餐");
        }

        @Override
        protected void lunch() {
            System.out.println("在公司午餐");
        }

        @Override
        protected void dinner() {
            System.out.println("在公司晚餐");
        }

        @Override
        protected void goToSleep() {
            System.out.println("睡觉");
        }
    }

    class fallIllDay extends AbstractDay {

        private boolean flag = false;

        public void setFlag(boolean shouldApply) {
            flag = shouldApply;
        }

        @Override
        protected boolean shouldBreakfastApply() {
            return this.flag;
        }

        @Override
        protected void getup() {
            System.out.println("起床");
        }

        @Override
        protected void breakfast() {
            System.out.println("早餐");
        }

        @Override
        protected void lunch() {
            System.out.println("午餐");
        }

        @Override
        protected void dinner() {
            System.out.println("晚餐");
        }

        @Override
        protected void goToSleep() {
            System.out.println("睡觉");
        }
    }


    public static void main(String[] args) {
        Integer aa = 100;
        Integer bb = 100;
        System.out.println(aa == bb);
        Integer cc = 200;
        Integer dd = 200;
        System.out.println(cc == dd);
    }
}
