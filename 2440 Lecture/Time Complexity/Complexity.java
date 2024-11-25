package Time Complexity;

public class Complexity {
    
    public int method1(int n){   //BIG OH = O(n^4)
  
        int steps = 0;
        for(int i = 0; i < n; i++){  //O(n)

            for(int j = 0; j < i*i*i; j++){ //O(n^3)
                steps++;
            }
        }
        return steps;
    }


    public int method2(int n){    //BIG OH = O(n^2)

        int steps = 0; // O(1) + 

        for(int i = 0; i < n * n; i++){ // O(n^2)

            steps++;
        }

        for(int j = 0; j < n; j++){ //O(n)
            steps++;
        }

        return steps;
    }

    public int method3(int n ){

        int steps = 0;

        for(int k = 0; k < n * n; k++){

            method(k);
            steps++;
        }
        return steps;
    }

    public int method5(int n){  //  BIG OH = O(n^5)

        int steps = 0;
        for(int i = 0; i < n; i++){  // O(n)

            for(int j = 0; j < i * i; j++){  // O(n^2)

                steps++;
                if(j % 2 == 0){   //Can still run code so multiply all 

                    for(int k = 0; k < j; k++){  // O(n^2)

                        steps++;
                    }
                }
            }
        }
        return steps;
    }
}
