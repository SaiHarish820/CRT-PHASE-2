#include<bits/stdc++.h>
using namespace std;

void buildMaxHeap(int arr[], int n){
    for(int i = n / 2 -1 ; i >= 0 ; i-- ){
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    
    if(left < n && arr[left] > arr[largest]){
        largest = left;
    }
    
    if(right < n && arr[right] > arr[largest]){
        largest = right;
    }
    if(largest!= i){
        swap(arr[i],arr[largest]);
        
        buildMaxHeap(arr,n);
    }
} 
}