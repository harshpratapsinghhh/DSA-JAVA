// In this we find max  vaule and place it as root value.
package Sorting;

public class HeapSort {
    public static void heapify(int arr[], int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Main function to do heap sort
    public static void sort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr:inlineRefs{references="&#91;&#123;&quot;type&quot;&#58;&quot;inline_reference&quot;,&quot;start_index&quot;&#58;1286,&quot;end_index&quot;&#58;1289,&quot;number&quot;&#58;0,&quot;url&quot;&#58;&quot;https&#58;//www.programiz.com/dsa/heap-sort&quot;,&quot;favicon&quot;&#58;&quot;https&#58;//imgs.search.brave.com/sLWSVLS2Umji7yEuMboejjd09dYXJyxRdYtZmK0dgyM/rs&#58;fit&#58;32&#58;32&#58;1&#58;0/g&#58;ce/aHR0cDovL2Zhdmlj/b25zLnNlYXJjaC5i/cmF2ZS5jb20vaWNv/bnMvMGJlN2U1YjVi/Y2M3ZDU5OGMwMWNi/M2Q3YjhjOTM1ZTFk/Y2NkZjE4NGQwOGIx/MTQ4NjI2YmNhODVj/MzFkMmJhYy93d3cu/cHJvZ3JhbWl6LmNv/bS8&quot;,&quot;snippet&quot;&#58;&quot;Best&#58;&#32;O(nlog&#32;n)…&quot;&#125;&#93;"};
            arr:inlineRefs{references="&#91;&#123;&quot;type&quot;&#58;&quot;inline_reference&quot;,&quot;start_index&quot;&#58;1306,&quot;end_index&quot;&#58;1309,&quot;number&quot;&#58;0,&quot;url&quot;&#58;&quot;https&#58;//www.programiz.com/dsa/heap-sort&quot;,&quot;favicon&quot;&#58;&quot;https&#58;//imgs.search.brave.com/sLWSVLS2Umji7yEuMboejjd09dYXJyxRdYtZmK0dgyM/rs&#58;fit&#58;32&#58;32&#58;1&#58;0/g&#58;ce/aHR0cDovL2Zhdmlj/b25zLnNlYXJjaC5i/cmF2ZS5jb20vaWNv/bnMvMGJlN2U1YjVi/Y2M3ZDU5OGMwMWNi/M2Q3YjhjOTM1ZTFk/Y2NkZjE4NGQwOGIx/MTQ4NjI2YmNhODVj/MzFkMmJhYy93d3cu/cHJvZ3JhbWl6LmNv/bS8&quot;,&quot;snippet&quot;&#58;&quot;Best&#58;&#32;O(nlog&#32;n)…&quot;&#125;&#93;"} = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
}
