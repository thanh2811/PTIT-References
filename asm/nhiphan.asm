.model small
.stack 100
.data
    tbao db 'Nhap vao day nhi phan: $'
.code 
main proc
    mov ax,@data
    mov ds,ax
    ; dua ra thong bao
    ;mov ah,9
    ;lea dx,tbao
    ;int 21h      
    xor bx,bx   ;set bx = 0
    
    ; nhap day nhi phan
    mov ah,1
    nhap:
        int 21h
        cmp al,13
        je thoidoc
        and al,0Fh
        shl bx,1
        or bl,al
        jmp nhap
    thoidoc:
        mov cx,16
        mov ah,2
        hienthi:  
            xor dl,dl
            rol bx,1
            adc dl,30h
            int 21h
            loop hienthi
        mov ah,4ch
        int 21h                        
    
    
    main endp
end main