
    import java.util.*;

public class SearchingAlgorithms {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search (for sorted array)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Jump Search
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (prev < n && arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Exponential Search
    public static int exponentialSearch(int[] arr, int target) {
        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i = i * 2;
        }

        return Arrays.binarySearch(arr, i / 2, Math.min(i, arr.length), target);
    }

    // Interpolation Search
    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            int pos = low + ((target - arr[low]) * (high - low))
                    / (arr[high] - arr[low]);

            if (arr[pos] == target) {
                return pos;
            } else if (arr[pos] < target) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1;
    }

    // Main method (testing all searches)
    public static void main(String[] args) {
        int[] data = {5, 12, 18, 25, 37, 42};
        int target = 25;

        System.out.println("Linear Search Index: " + linearSearch(data, target));
        System.out.println("Binary Search Index: " + binarySearch(data, target));
        System.out.println("Jump Search Index: " + jumpSearch(data, target));
        System.out.println("Exponential Search Index: " + exponentialSearch(data, target));
        System.out.println("Interpolation Search Index: " + interpolationSearch(data, target));
    }
}

}
