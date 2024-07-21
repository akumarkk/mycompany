// See https://aka.ms/new-console-template for more information
// Console.WriteLine("Hello, World!");
namespace Program {
    public class Program {

        static void print(int[] arr) {
            for(int i=0; i < arr.Length; i++) {
                Console.WriteLine(arr[i]);
            }
        }

        static void subseq(int[] arr, int i, List<int> buf) {
            if(i == arr.Length) {
                Console.WriteLine(String.Join(" ", buf));
                return;
            }

            subseq(arr, i+1, buf);
            
            buf.Add(arr[i]);
            int _i = buf.Count-1; 
            subseq(arr, i+1, buf);
            buf.RemoveAt( _i);
        
        }

        public static void Main() {
            Console.WriteLine("hello from main");
            int[] arr = new int[]{3, 15, 6};
            List<int> buf = new List<int>();

            subseq(arr, 0, buf);
        }
    }
}
