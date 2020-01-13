<?php
    /**
        Nama file : koneksi.php
        Developer : Yosef Murya Kusuma Ardhana
        Company   : www.langitinspirasi.co.id
     */
    require_once 'koneksi.php';
     include 'koneksi.php';
    
    $kodeFakultas = $_POST['kode_fakultas'];
    $namaFakultas = $_POST['nama_fakultas'];

    if(!$kodeFakultas || !$namaFakultas){
        echo json_encode(array('message'=>'required field is empty.'));
    }
    else{
        $query = mysqli_query($con."INSERT INTO fakultas VALUES('','$kodeFakultas','$namaFakultas')");

        if($query){
            echo json_encode(array('message'=>'fakultas data successfully added.'));
        }
        else{
            echo json_encode(array('message'=>'fakultas data failed to add.'));
        }
    }
?>