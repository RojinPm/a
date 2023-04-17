}
public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.menuval,menu);
    return true;
}
public boolean onOptionsItemSelected(MenuItem item){

    Toast.makeText(this, "Selected" +item.getTitle(), Toast.LENGTH_SHORT).show();

     switch(item.getItemId()){

         case R.id.insertItem:
             Toast.makeText(this, "InsertIcon", Toast.LENGTH_SHORT).show();
             return true;

         case R.id.selectItem:
             Toast.makeText(this, "SelectItem", Toast.LENGTH_SHORT).show();
             return true;

         default:super.onOptionsItemSelected(item);
     }


    return false;
}

}