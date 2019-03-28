package com.Lectures;

public class Main {

    public static void main(String[] args)
    {
        String[] array = new String[]{"Alphc","Alphb","Alpha","Al","Hello", "World", "Beta","Quinzo", "Charlie", "Foo","A", "B","C","H","Q","Zeta","Sort","Ralph","Mongo"};
        String[] array2 = new String[array.length];
        String swap = "";
        String one = "";
        String two = "";

        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int c = 0;


        //access array
        for(i = 0; i < array.length; i++)
        {
            System.out.printf("%s, ", array[i]);
        }
        System.out.printf("\n");

        for(i = 0; i < array.length; i++)//itterates the array array.length number of times
        {
            for(j = 0, k = 1; j < array.length; j++, k++)//to access two arrays at a time
            {
                if(k == array.length)//adjusts k for when j == array.length-1
                {
                    k--;
                }
                one = array[j];//string one = array[0]
                two = array[k];//string two = array[1]
                if(one.charAt(0) > two.charAt(0))//if the first char of one is greater than the first of two, then swap
                {
                    swap = array[j];
                    array[j] = array[k];
                    array[k] = swap;
                }
                //if char 0 at one == char 0 at two
                else if(one.charAt(0) == two.charAt(0))
                {
                    if(one.length() > two.length())//swap so the shortest is in string one and in array[j]
                    {
                        swap = array[j];
                        array[j] = array[k];
                        array[k] = swap;
                        one = array[j];
                        two = array[k];
                    }
                    //c is 1 because we'v already checked charAt(0)
                    for(c = 0; c < one.length(); c++)//so long as c is less than one; the shorter string
                    {//compare char 1, then 2..... unti l we find th lower of the two
                        if(one.charAt(c) > two.charAt(c))//if any char in one is larger, swap the array position
                        {
                            swap = array[j];
                            array[j] = array[k];
                            array[k] = swap;
                            //System.out.printf("%d - %d. %s %s, %s %s\n", i, c, one, two, array[j], array[k]);
                        }
                    }
                }
                array2[j] = array[j];//add to array2
            }
        }

        for(i = 0; i < array2.length; i++)//print array2
        {
            if(i < array2.length-1) {
                System.out.printf("%s, ", array2[i]);
            }else{
                System.out.printf("%s", array2[i]);
            }
        }
        System.out.printf("\n");
    }
}
