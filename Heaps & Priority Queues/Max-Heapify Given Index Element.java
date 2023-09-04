#include<bits/stdc++.h>
using namespace std;

void maxHeapifyShiftDown(int arr[], int n, int idx){
    int largest = idx;
    int left = 2*idx+1;
    int right = 2*idx+2;
    
    if(left < n && arr[left] > arr[largest]){
        largest = left;
    }
    
    if(right < n && arr[right] > arr[largest]){
        largest = right;
    }
    
    if(largest!=idx){
        swap(arr[idx],arr[largest]);
        
        maxHeapifyShiftDown(arr,n,largest);
    }
   
}Max-Heapify Given Index Element