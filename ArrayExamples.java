

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] placeHolder = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      placeHolder[i] = arr[arr.length - i - 1]; //need another array to store values because values are overwriting each other
    }

    //all values are stored into placeHolder starting from the end
    //this for loop replaces every value in arr with the 'reversed' values in placeHolder
    for(int x = 0; x < placeHolder.length; x++) {
      arr[x] = placeHolder[x];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1]; //values should be put into newArray[i] = arr[...]
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }


}

