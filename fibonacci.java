public class fibonacci {
    
    f1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        int limit = Integer.parseInt(t1.getText().toString());
        int first = 0;
        int second = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("Fibonacci series up to
       ").append(limit).append(": ");
        while (first <= limit) {
        sb.append(first).append(" ");
        int sum = first + second;
       first = second;
       second = sum;
        }
        Toast.makeText(MainActivity.this, sb.toString(),
       Toast.LENGTH_SHORT).show();
        }
        });
       
}
