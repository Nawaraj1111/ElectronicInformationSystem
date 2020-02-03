
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakurae
 */
public class SelectionSort {
    public static void sort(ArrayList<POJO_Class> sorting){
        for (int i = 0; i < sorting.size() - 1; i++){
            int minPos = minimumPosition(sorting,i);
            POJO_Class temp = sorting.get(i);
            sorting.set(i,sorting.get(minPos));
            sorting.set(minPos,temp);
        }
    }
    
    public static int minimumPosition(ArrayList<POJO_Class> sortArray,int from){
      int minPos = from;
      for (int i = from + 1; i < sortArray.size(); i++)
      {
          if (sortArray.get(i).getPrice() < sortArray.get(minPos).getPrice()){
                  minPos = i; 
              }
      }
      return minPos;
    }
}
