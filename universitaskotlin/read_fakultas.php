<?php
    /**
        Nama file : koneksi.php
        Developer : Yosef Murya Kusuma Ardhana
        Company   : www.langitinspirasi.co.id
     */
    require_once 'koneksi.php';
    $result = array();
    $query  = mysqli_query($con,"SELECT * FROM fakultas ORDER BY id_fakultas DESC");

    while($row = mysqli_fetch_assoc($query)){
        $result[]=$row;
    }
    echo json_encode(array('result'=>$result));
?>