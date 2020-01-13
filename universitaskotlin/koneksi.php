<?php
    /**
        Nama file : koneksi.php
        Developer : Yosef Murya Kusuma Ardhana
        Company   : www.langitinspirasi.co.id
     */

     $con = mysqli_connect("localhost","root","","universitas_kotlin");

     if (mysqli_connect_errno()){
         echo "Failed to connect to MySQL: " .mysqli_connect_error();
     }
     ?>