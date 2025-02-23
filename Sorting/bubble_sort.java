// bubble sorting with Time Complexity T(n) = O(n^2)
public static void bubble(int arr[]){
for(int i = 0;i<arr.length-1;i++){
for(int j = 0;j<arr.length-i-1;j++){
int tmp;
if(arr[j]>arr[j+1]){
tmp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = tmp;
}
}
}
}
